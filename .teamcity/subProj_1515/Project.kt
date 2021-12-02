package subProj_1515

import subProj_1515.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1515")
    name = "subProj 1515"

    buildType(subProj_bt_1515_3)
    buildType(subProj_bt_1515_2)
    buildType(subProj_bt_1515_5)
    buildType(subProj_bt_1515_4)
    buildType(subProj_bt_1515_1)
    buildType(subProj_bt_1515_0)
})
