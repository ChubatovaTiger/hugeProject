package subProj_761

import subProj_761.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_761")
    name = "subProj 761"

    buildType(subProj_bt_761_1)
    buildType(subProj_bt_761_0)
    buildType(subProj_bt_761_3)
    buildType(subProj_bt_761_2)
    buildType(subProj_bt_761_5)
    buildType(subProj_bt_761_4)
})
