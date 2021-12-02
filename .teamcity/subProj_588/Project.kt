package subProj_588

import subProj_588.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_588")
    name = "subProj 588"

    buildType(subProj_bt_588_1)
    buildType(subProj_bt_588_2)
    buildType(subProj_bt_588_0)
    buildType(subProj_bt_588_5)
    buildType(subProj_bt_588_3)
    buildType(subProj_bt_588_4)
})
