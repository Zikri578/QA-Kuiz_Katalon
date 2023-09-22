<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>Test Suite Menggunakana Data Driven Testing</description>
   <name>TS Login DDT</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>10</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>4b260d74-0312-494b-a47c-8aa342a9ccd5</testSuiteGuid>
   <testCaseLink>
      <guid>b73c68bf-2580-4304-a7ed-6a46cf7c00e4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/TC_Manual/Login/TC_Login_Sukses</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>81b569c0-0502-4973-af46-d30d61d48354</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/DataSanbercode/LoginData-Excel</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>81b569c0-0502-4973-af46-d30d61d48354</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>3a9c4d52-59a8-41a3-9437-1d8517e137fd</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>81b569c0-0502-4973-af46-d30d61d48354</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>df75bd59-bc3b-409c-acf8-776fc969572d</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
