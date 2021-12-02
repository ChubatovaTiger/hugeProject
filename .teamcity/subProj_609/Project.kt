package subProj_609

import subProj_609.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_609")
    name = "subProj 609"

    buildType(subProj_bt_609_1)
    buildType(subProj_bt_609_2)
    buildType(subProj_bt_609_3)
    buildType(subProj_bt_609_4)
    buildType(subProj_bt_609_0)
    buildType(subProj_bt_609_5)
})
