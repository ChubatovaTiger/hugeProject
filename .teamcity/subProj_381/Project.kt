package subProj_381

import subProj_381.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_381")
    name = "subProj 381"

    buildType(subProj_bt_381_5)
    buildType(subProj_bt_381_4)
    buildType(subProj_bt_381_1)
    buildType(subProj_bt_381_0)
    buildType(subProj_bt_381_3)
    buildType(subProj_bt_381_2)
})
