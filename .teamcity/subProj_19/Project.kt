package subProj_19

import subProj_19.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_19")
    name = "subProj 19"

    buildType(subProj_bt_19_1)
    buildType(subProj_bt_19_0)
    buildType(subProj_bt_19_5)
    buildType(subProj_bt_19_4)
    buildType(subProj_bt_19_3)
    buildType(subProj_bt_19_2)
})
