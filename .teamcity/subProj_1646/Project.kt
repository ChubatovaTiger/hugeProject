package subProj_1646

import subProj_1646.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1646")
    name = "subProj 1646"

    buildType(subProj_bt_1646_4)
    buildType(subProj_bt_1646_3)
    buildType(subProj_bt_1646_5)
    buildType(subProj_bt_1646_0)
    buildType(subProj_bt_1646_2)
    buildType(subProj_bt_1646_1)
})
