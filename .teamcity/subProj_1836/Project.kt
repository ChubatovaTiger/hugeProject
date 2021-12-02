package subProj_1836

import subProj_1836.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1836")
    name = "subProj 1836"

    buildType(subProj_bt_1836_5)
    buildType(subProj_bt_1836_4)
    buildType(subProj_bt_1836_1)
    buildType(subProj_bt_1836_0)
    buildType(subProj_bt_1836_3)
    buildType(subProj_bt_1836_2)
})
