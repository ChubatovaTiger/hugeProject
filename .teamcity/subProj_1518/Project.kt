package subProj_1518

import subProj_1518.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1518")
    name = "subProj 1518"

    buildType(subProj_bt_1518_0)
    buildType(subProj_bt_1518_2)
    buildType(subProj_bt_1518_1)
    buildType(subProj_bt_1518_4)
    buildType(subProj_bt_1518_3)
    buildType(subProj_bt_1518_5)
})
