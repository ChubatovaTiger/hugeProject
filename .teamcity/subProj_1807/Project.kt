package subProj_1807

import subProj_1807.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1807")
    name = "subProj 1807"

    buildType(subProj_bt_1807_5)
    buildType(subProj_bt_1807_4)
    buildType(subProj_bt_1807_3)
    buildType(subProj_bt_1807_2)
    buildType(subProj_bt_1807_1)
    buildType(subProj_bt_1807_0)
})
