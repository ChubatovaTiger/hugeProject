package subProj_1249

import subProj_1249.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1249")
    name = "subProj 1249"

    buildType(subProj_bt_1249_1)
    buildType(subProj_bt_1249_0)
    buildType(subProj_bt_1249_3)
    buildType(subProj_bt_1249_2)
    buildType(subProj_bt_1249_5)
    buildType(subProj_bt_1249_4)
})
