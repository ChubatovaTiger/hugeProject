package subProj_1638

import subProj_1638.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1638")
    name = "subProj 1638"

    buildType(subProj_bt_1638_0)
    buildType(subProj_bt_1638_1)
    buildType(subProj_bt_1638_2)
    buildType(subProj_bt_1638_3)
    buildType(subProj_bt_1638_4)
    buildType(subProj_bt_1638_5)
})
