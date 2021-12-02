package subProj_1905

import subProj_1905.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1905")
    name = "subProj 1905"

    buildType(subProj_bt_1905_5)
    buildType(subProj_bt_1905_0)
    buildType(subProj_bt_1905_2)
    buildType(subProj_bt_1905_1)
    buildType(subProj_bt_1905_4)
    buildType(subProj_bt_1905_3)
})
