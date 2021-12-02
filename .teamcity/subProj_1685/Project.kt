package subProj_1685

import subProj_1685.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1685")
    name = "subProj 1685"

    buildType(subProj_bt_1685_3)
    buildType(subProj_bt_1685_2)
    buildType(subProj_bt_1685_1)
    buildType(subProj_bt_1685_0)
    buildType(subProj_bt_1685_5)
    buildType(subProj_bt_1685_4)
})
