package subProj_959

import subProj_959.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_959")
    name = "subProj 959"

    buildType(subProj_bt_959_0)
    buildType(subProj_bt_959_2)
    buildType(subProj_bt_959_1)
    buildType(subProj_bt_959_4)
    buildType(subProj_bt_959_3)
    buildType(subProj_bt_959_5)
})
