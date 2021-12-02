package subProj_938

import subProj_938.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_938")
    name = "subProj 938"

    buildType(subProj_bt_938_0)
    buildType(subProj_bt_938_1)
    buildType(subProj_bt_938_2)
    buildType(subProj_bt_938_3)
    buildType(subProj_bt_938_4)
    buildType(subProj_bt_938_5)
})
