package subProj_933

import subProj_933.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_933")
    name = "subProj 933"

    buildType(subProj_bt_933_3)
    buildType(subProj_bt_933_4)
    buildType(subProj_bt_933_5)
    buildType(subProj_bt_933_0)
    buildType(subProj_bt_933_1)
    buildType(subProj_bt_933_2)
})
