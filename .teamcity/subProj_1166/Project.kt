package subProj_1166

import subProj_1166.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1166")
    name = "subProj 1166"

    buildType(subProj_bt_1166_5)
    buildType(subProj_bt_1166_4)
    buildType(subProj_bt_1166_3)
    buildType(subProj_bt_1166_2)
    buildType(subProj_bt_1166_1)
    buildType(subProj_bt_1166_0)
})
