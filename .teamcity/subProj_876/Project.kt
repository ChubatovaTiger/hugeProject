package subProj_876

import subProj_876.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_876")
    name = "subProj 876"

    buildType(subProj_bt_876_5)
    buildType(subProj_bt_876_0)
    buildType(subProj_bt_876_4)
    buildType(subProj_bt_876_3)
    buildType(subProj_bt_876_2)
    buildType(subProj_bt_876_1)
})
