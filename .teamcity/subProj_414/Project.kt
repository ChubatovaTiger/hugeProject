package subProj_414

import subProj_414.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_414")
    name = "subProj 414"

    buildType(subProj_bt_414_0)
    buildType(subProj_bt_414_1)
    buildType(subProj_bt_414_2)
    buildType(subProj_bt_414_3)
    buildType(subProj_bt_414_4)
    buildType(subProj_bt_414_5)
})
