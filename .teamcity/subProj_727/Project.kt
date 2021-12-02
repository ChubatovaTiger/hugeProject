package subProj_727

import subProj_727.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_727")
    name = "subProj 727"

    buildType(subProj_bt_727_3)
    buildType(subProj_bt_727_2)
    buildType(subProj_bt_727_1)
    buildType(subProj_bt_727_0)
    buildType(subProj_bt_727_5)
    buildType(subProj_bt_727_4)
})
