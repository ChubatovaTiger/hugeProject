package subProj_638

import subProj_638.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_638")
    name = "subProj 638"

    buildType(subProj_bt_638_5)
    buildType(subProj_bt_638_2)
    buildType(subProj_bt_638_1)
    buildType(subProj_bt_638_4)
    buildType(subProj_bt_638_3)
    buildType(subProj_bt_638_0)
})
