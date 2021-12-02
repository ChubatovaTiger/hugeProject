package subProj_493

import subProj_493.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_493")
    name = "subProj 493"

    buildType(subProj_bt_493_2)
    buildType(subProj_bt_493_3)
    buildType(subProj_bt_493_4)
    buildType(subProj_bt_493_5)
    buildType(subProj_bt_493_0)
    buildType(subProj_bt_493_1)
})
