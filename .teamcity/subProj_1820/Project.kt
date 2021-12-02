package subProj_1820

import subProj_1820.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1820")
    name = "subProj 1820"

    buildType(subProj_bt_1820_1)
    buildType(subProj_bt_1820_2)
    buildType(subProj_bt_1820_3)
    buildType(subProj_bt_1820_4)
    buildType(subProj_bt_1820_0)
    buildType(subProj_bt_1820_5)
})
