package subProj_627

import subProj_627.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_627")
    name = "subProj 627"

    buildType(subProj_bt_627_5)
    buildType(subProj_bt_627_2)
    buildType(subProj_bt_627_1)
    buildType(subProj_bt_627_4)
    buildType(subProj_bt_627_3)
    buildType(subProj_bt_627_0)
})
