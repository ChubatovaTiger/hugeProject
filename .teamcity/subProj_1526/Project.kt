package subProj_1526

import subProj_1526.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1526")
    name = "subProj 1526"

    buildType(subProj_bt_1526_4)
    buildType(subProj_bt_1526_5)
    buildType(subProj_bt_1526_2)
    buildType(subProj_bt_1526_3)
    buildType(subProj_bt_1526_0)
    buildType(subProj_bt_1526_1)
})
