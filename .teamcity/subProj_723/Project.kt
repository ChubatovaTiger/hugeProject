package subProj_723

import subProj_723.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_723")
    name = "subProj 723"

    buildType(subProj_bt_723_5)
    buildType(subProj_bt_723_4)
    buildType(subProj_bt_723_3)
    buildType(subProj_bt_723_2)
    buildType(subProj_bt_723_1)
    buildType(subProj_bt_723_0)
})
