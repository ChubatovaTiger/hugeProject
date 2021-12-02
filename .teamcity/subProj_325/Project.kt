package subProj_325

import subProj_325.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_325")
    name = "subProj 325"

    buildType(subProj_bt_325_1)
    buildType(subProj_bt_325_0)
    buildType(subProj_bt_325_5)
    buildType(subProj_bt_325_4)
    buildType(subProj_bt_325_3)
    buildType(subProj_bt_325_2)
})
