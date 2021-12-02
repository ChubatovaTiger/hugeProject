package subProj_654

import subProj_654.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_654")
    name = "subProj 654"

    buildType(subProj_bt_654_5)
    buildType(subProj_bt_654_3)
    buildType(subProj_bt_654_4)
    buildType(subProj_bt_654_1)
    buildType(subProj_bt_654_2)
    buildType(subProj_bt_654_0)
})
