package subProj_1623

import subProj_1623.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1623")
    name = "subProj 1623"

    buildType(subProj_bt_1623_4)
    buildType(subProj_bt_1623_5)
    buildType(subProj_bt_1623_0)
    buildType(subProj_bt_1623_1)
    buildType(subProj_bt_1623_2)
    buildType(subProj_bt_1623_3)
})
