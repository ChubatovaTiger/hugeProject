package subProj_1725

import subProj_1725.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1725")
    name = "subProj 1725"

    buildType(subProj_bt_1725_0)
    buildType(subProj_bt_1725_5)
    buildType(subProj_bt_1725_3)
    buildType(subProj_bt_1725_4)
    buildType(subProj_bt_1725_1)
    buildType(subProj_bt_1725_2)
})
