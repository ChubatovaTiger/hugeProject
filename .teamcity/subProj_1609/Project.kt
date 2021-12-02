package subProj_1609

import subProj_1609.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1609")
    name = "subProj 1609"

    buildType(subProj_bt_1609_5)
    buildType(subProj_bt_1609_4)
    buildType(subProj_bt_1609_3)
    buildType(subProj_bt_1609_2)
    buildType(subProj_bt_1609_1)
    buildType(subProj_bt_1609_0)
})
