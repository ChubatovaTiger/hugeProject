package subProj_807

import subProj_807.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_807")
    name = "subProj 807"

    buildType(subProj_bt_807_0)
    buildType(subProj_bt_807_1)
    buildType(subProj_bt_807_2)
    buildType(subProj_bt_807_3)
    buildType(subProj_bt_807_4)
    buildType(subProj_bt_807_5)
})
