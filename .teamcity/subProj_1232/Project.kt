package subProj_1232

import subProj_1232.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1232")
    name = "subProj 1232"

    buildType(subProj_bt_1232_2)
    buildType(subProj_bt_1232_3)
    buildType(subProj_bt_1232_4)
    buildType(subProj_bt_1232_5)
    buildType(subProj_bt_1232_0)
    buildType(subProj_bt_1232_1)
})
