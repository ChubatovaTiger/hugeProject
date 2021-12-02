package subProj_452

import subProj_452.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_452")
    name = "subProj 452"

    buildType(subProj_bt_452_5)
    buildType(subProj_bt_452_3)
    buildType(subProj_bt_452_4)
    buildType(subProj_bt_452_1)
    buildType(subProj_bt_452_2)
    buildType(subProj_bt_452_0)
})
