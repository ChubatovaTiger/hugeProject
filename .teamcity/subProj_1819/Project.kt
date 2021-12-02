package subProj_1819

import subProj_1819.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1819")
    name = "subProj 1819"

    buildType(subProj_bt_1819_3)
    buildType(subProj_bt_1819_4)
    buildType(subProj_bt_1819_5)
    buildType(subProj_bt_1819_0)
    buildType(subProj_bt_1819_1)
    buildType(subProj_bt_1819_2)
})
