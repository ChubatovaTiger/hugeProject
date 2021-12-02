package subProj_746

import subProj_746.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_746")
    name = "subProj 746"

    buildType(subProj_bt_746_3)
    buildType(subProj_bt_746_4)
    buildType(subProj_bt_746_5)
    buildType(subProj_bt_746_0)
    buildType(subProj_bt_746_1)
    buildType(subProj_bt_746_2)
})
