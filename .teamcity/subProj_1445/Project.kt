package subProj_1445

import subProj_1445.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1445")
    name = "subProj 1445"

    buildType(subProj_bt_1445_3)
    buildType(subProj_bt_1445_2)
    buildType(subProj_bt_1445_5)
    buildType(subProj_bt_1445_4)
    buildType(subProj_bt_1445_1)
    buildType(subProj_bt_1445_0)
})
