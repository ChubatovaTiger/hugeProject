package subProj_169

import subProj_169.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_169")
    name = "subProj 169"

    buildType(subProj_bt_169_0)
    buildType(subProj_bt_169_1)
    buildType(subProj_bt_169_2)
    buildType(subProj_bt_169_3)
    buildType(subProj_bt_169_4)
    buildType(subProj_bt_169_5)
})
