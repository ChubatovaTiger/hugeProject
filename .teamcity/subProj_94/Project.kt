package subProj_94

import subProj_94.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_94")
    name = "subProj 94"

    buildType(subProj_bt_94_2)
    buildType(subProj_bt_94_1)
    buildType(subProj_bt_94_0)
    buildType(subProj_bt_94_5)
    buildType(subProj_bt_94_4)
    buildType(subProj_bt_94_3)
})
