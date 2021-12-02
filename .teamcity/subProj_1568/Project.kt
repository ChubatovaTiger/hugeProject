package subProj_1568

import subProj_1568.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1568")
    name = "subProj 1568"

    buildType(subProj_bt_1568_4)
    buildType(subProj_bt_1568_5)
    buildType(subProj_bt_1568_0)
    buildType(subProj_bt_1568_1)
    buildType(subProj_bt_1568_2)
    buildType(subProj_bt_1568_3)
})
