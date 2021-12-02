package subProj_646

import subProj_646.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_646")
    name = "subProj 646"

    buildType(subProj_bt_646_4)
    buildType(subProj_bt_646_5)
    buildType(subProj_bt_646_2)
    buildType(subProj_bt_646_3)
    buildType(subProj_bt_646_0)
    buildType(subProj_bt_646_1)
})
