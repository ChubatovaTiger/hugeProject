package subProj_958

import subProj_958.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_958")
    name = "subProj 958"

    buildType(subProj_bt_958_1)
    buildType(subProj_bt_958_0)
    buildType(subProj_bt_958_3)
    buildType(subProj_bt_958_2)
    buildType(subProj_bt_958_5)
    buildType(subProj_bt_958_4)
})
