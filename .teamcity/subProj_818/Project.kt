package subProj_818

import subProj_818.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_818")
    name = "subProj 818"

    buildType(subProj_bt_818_0)
    buildType(subProj_bt_818_2)
    buildType(subProj_bt_818_1)
    buildType(subProj_bt_818_4)
    buildType(subProj_bt_818_3)
    buildType(subProj_bt_818_5)
})
