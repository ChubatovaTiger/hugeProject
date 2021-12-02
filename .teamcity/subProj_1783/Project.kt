package subProj_1783

import subProj_1783.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1783")
    name = "subProj 1783"

    buildType(subProj_bt_1783_0)
    buildType(subProj_bt_1783_2)
    buildType(subProj_bt_1783_1)
    buildType(subProj_bt_1783_4)
    buildType(subProj_bt_1783_3)
    buildType(subProj_bt_1783_5)
})
