package subProj_698

import subProj_698.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_698")
    name = "subProj 698"

    buildType(subProj_bt_698_0)
    buildType(subProj_bt_698_1)
    buildType(subProj_bt_698_2)
    buildType(subProj_bt_698_3)
    buildType(subProj_bt_698_4)
    buildType(subProj_bt_698_5)
})
