package subProj_1954

import subProj_1954.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1954")
    name = "subProj 1954"

    buildType(subProj_bt_1954_0)
    buildType(subProj_bt_1954_1)
    buildType(subProj_bt_1954_2)
    buildType(subProj_bt_1954_3)
    buildType(subProj_bt_1954_4)
    buildType(subProj_bt_1954_5)
})
