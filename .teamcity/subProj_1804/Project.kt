package subProj_1804

import subProj_1804.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1804")
    name = "subProj 1804"

    buildType(subProj_bt_1804_2)
    buildType(subProj_bt_1804_1)
    buildType(subProj_bt_1804_0)
    buildType(subProj_bt_1804_5)
    buildType(subProj_bt_1804_4)
    buildType(subProj_bt_1804_3)
})
