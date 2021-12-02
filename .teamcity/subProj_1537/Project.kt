package subProj_1537

import subProj_1537.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1537")
    name = "subProj 1537"

    buildType(subProj_bt_1537_4)
    buildType(subProj_bt_1537_5)
    buildType(subProj_bt_1537_2)
    buildType(subProj_bt_1537_3)
    buildType(subProj_bt_1537_0)
    buildType(subProj_bt_1537_1)
})
