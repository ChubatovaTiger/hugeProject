package subProj_1531

import subProj_1531.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1531")
    name = "subProj 1531"

    buildType(subProj_bt_1531_2)
    buildType(subProj_bt_1531_3)
    buildType(subProj_bt_1531_0)
    buildType(subProj_bt_1531_1)
    buildType(subProj_bt_1531_4)
    buildType(subProj_bt_1531_5)
})
