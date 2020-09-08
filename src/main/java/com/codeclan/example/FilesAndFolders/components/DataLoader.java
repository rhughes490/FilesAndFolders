package com.codeclan.example.FilesAndFolders.components;

import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args) {

        User user1 = new User("Joe Blogs");
        userRepository.save(user1);

        User user2 = new User("John Blogs");
        userRepository.save(user2);

        User user3 = new User("Betty Blogs");
        userRepository.save(user3);

        User user4 = new User("Barbara Blogs");
        userRepository.save(user4);

        Folder folder1 = new Folder("Work", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("Personal", user1);
        folderRepository.save(folder2);

        Folder folder3 = new Folder("Hobbies", user1);
        folderRepository.save(folder3);

        Folder folder4 = new Folder("Misc", user1);
        folderRepository.save(folder4);

        File file1 = new File("ToDo", "DOC", 50, folder1);
        fileRepository.save(file1);

        File file2 = new File("HolidayPhoto", "JPG", 20, folder2);
        fileRepository.save(file2);

        File file3 = new File("Fishing", "PPT", 100, folder3);
        fileRepository.save(file1);

        File file4 = new File("Letter", "PDF", 7, folder4);
        fileRepository.save(file4);

    }

}
