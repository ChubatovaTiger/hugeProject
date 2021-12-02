package subProj_1671

import subProj_1671.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1671")
    name = "subProj 1671"

    buildType(subProj_bt_1671_1)
    buildType(subProj_bt_1671_2)
    buildType(subProj_bt_1671_0)
    buildType(subProj_bt_1671_5)
    buildType(subProj_bt_1671_3)
    buildType(subProj_bt_1671_4)
})
