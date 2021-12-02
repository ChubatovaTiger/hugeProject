package subProj_1541

import subProj_1541.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1541")
    name = "subProj 1541"

    buildType(subProj_bt_1541_0)
    buildType(subProj_bt_1541_4)
    buildType(subProj_bt_1541_3)
    buildType(subProj_bt_1541_2)
    buildType(subProj_bt_1541_1)
    buildType(subProj_bt_1541_5)
})
