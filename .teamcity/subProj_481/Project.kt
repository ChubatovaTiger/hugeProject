package subProj_481

import subProj_481.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_481")
    name = "subProj 481"

    buildType(subProj_bt_481_2)
    buildType(subProj_bt_481_1)
    buildType(subProj_bt_481_0)
    buildType(subProj_bt_481_5)
    buildType(subProj_bt_481_4)
    buildType(subProj_bt_481_3)
})
